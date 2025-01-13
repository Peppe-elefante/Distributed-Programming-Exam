/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author ACER
 */
@DataSourceDefinition(
 className = "org.apache.derby.jdbc.EmbeddedDataSource",
 name = "java:global/jdbc/EsameDS",
 databaseName = "esameDB",
 properties = {"connectionAttributes=;create=true"}
)
public class DatabaseProducer {
   @Produces
   @PersistenceContext(unitName="EsamePu")
   private EntityManager em;
}
