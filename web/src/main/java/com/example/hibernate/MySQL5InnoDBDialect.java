/**
 * 
 */
package com.example.hibernate;

import java.sql.Types;


/**
 * Why? https://hibernate.onjira.com/browse/HHH-6935
 * 
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
public class MySQL5InnoDBDialect extends org.hibernate.dialect.MySQL5InnoDBDialect {
    
    public MySQL5InnoDBDialect() {
        super(); 
        registerColumnType(Types.BOOLEAN, "bit(1)");
    }

}
