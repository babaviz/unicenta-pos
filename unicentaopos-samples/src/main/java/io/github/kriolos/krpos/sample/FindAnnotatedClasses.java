
package io.github.kriolos.krpos.sample;

import org.reflections.Reflections;
import liquibase.datatype.DataTypeInfo;

/**
 *
 * @author pauloborges
 */
public class FindAnnotatedClasses {
    public static void main(String[] args) {
        System.out.println("Scanning all annotated liquidbase");
 
        Reflections ref = new Reflections("liquibase.datatype.core");
        for (Class<?> cl : ref.getTypesAnnotatedWith(DataTypeInfo.class)) {
            DataTypeInfo datatypeinfo = cl.getAnnotation(DataTypeInfo.class);
            System.out.printf("Class: %s, with meta name: %s and meta priority: %s%n",
                    cl.getSimpleName(), datatypeinfo.name(), datatypeinfo.priority());
            System.out.print("\tAlias: ");
            for (String alias : datatypeinfo.aliases()){
                System.out.print(" "+alias +";");
            }
            System.out.println("");
        }
    }
}
