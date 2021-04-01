
package com.openbravo.pos.scripting;

import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author pauloborges
 */
public class PosScriptEngineMng {

    public void numerateScriptEngines() {

        ScriptEngineManager mgr = new ScriptEngineManager();

        List<ScriptEngineFactory> factories = mgr.getEngineFactories();

        factories.stream().map(factory -> {
            System.out.printf("ScriptEngineFactory Info: %s%n\r\n", factory.getClass());
            return factory;
        }).forEachOrdered(factory -> {
            String engName = factory.getEngineName();
            String engVersion = factory.getEngineVersion();
            String langName = factory.getLanguageName();
            String langVersion = factory.getLanguageVersion();

            System.out.printf("\tScript Engine: %s (%s)%n", engName, engVersion);

            List<String> engNames = factory.getNames();
            engNames.forEach(name -> {
                System.out.printf("\tEngine Alias: %s%n", name);
            });

            List<String> engExts = factory.getExtensions();
            engExts.forEach(name -> {
                System.out.printf("\tEngine Ext: %s%n", name);
            });

            System.out.printf("\tLanguage: %s (%s)%n", langName, langVersion);
        });
    }

    public void executeKotlinScript() {
        try {

            javax.script.ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("kts");
            Objects.requireNonNull(engine, "Require ScriptEngine for Kotlin (.kts extension)");
            Object res1 = engine.eval("val velocity = 3");

            Objects.requireNonNull(res1, "res1 must not null");
            Object res2 = engine.eval("velocity + 2");

            assert (res2 instanceof Integer) : /*Assertation BAD */
                    "Velocidade da particula não pode ser maior que a velocidade da luz";

            assert ((Integer) res2 < 5) :
                    "Velocidade da particula não pode ser maior que a velocidade da luz";

            System.out.println("Valor em res2: "+ (Integer)res2);
        } catch (ScriptException ex) {
            Logger.getLogger(PosScriptEngineMng.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void executeGroovyScript() {
        try {
            javax.script.ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("groovy");
            Objects.requireNonNull(engine, "Require ScriptEngine for Groovy (.groovy extension)");
            Object res1 = engine.eval("def velocity = 3");
            Objects.requireNonNull(res1, "res1 must not null");
            Object res2 = engine.eval("velocity + 2");
            
            assert ((Integer) res2 < 5) :
                    "Velocidade da particula não pode ser maior que a velocidade da luz";
            
            System.out.println("Valor em res2: "+ (Integer)res2);
            
        } catch (ScriptException ex) {
            Logger.getLogger(PosScriptEngineMng.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        PosScriptEngineMng psmng = new PosScriptEngineMng();

        System.out.println("numerateScriptEngines ========================");
        psmng.numerateScriptEngines();
        
        System.out.println("cexecuteGroovyScript ========================");
        psmng.executeGroovyScript();
        
        //System.out.println("executeKotlinScript ========================");
        //psmng.executeKotlinScript();

    }
}
