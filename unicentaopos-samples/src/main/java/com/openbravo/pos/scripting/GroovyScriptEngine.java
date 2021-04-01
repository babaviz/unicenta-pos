
package com.openbravo.pos.scripting;

import com.google.auto.service.AutoService;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

/**
 *
 * @author pauloborges
 */
@AutoService(ScriptEngine.class)
public class GroovyScriptEngine implements ScriptEngine {

    // call groovy expressions from Java code
    Binding binding = new Binding();

    @Override
    public void put(String key, Object value) {
        binding.setVariable(key, key);

    }

    @Override
    public Object get(String key) {
        return binding.getVariable(key);
    }

    @Override
    public Object eval(String src) throws ScriptException {
        
        GroovyShell shell = new GroovyShell(binding);
        Object value = shell.evaluate(src);
        return value;
    }

}

