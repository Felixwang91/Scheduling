/**
 */
package scheduling;

import java.sql.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scheduling.Recipe#getRecipeName <em>Recipe Name</em>}</li>
 *   <li>{@link scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}</li>
 *   <li>{@link scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}</li>
 *   <li>{@link scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}</li>
 *   <li>{@link scheduling.Recipe#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link scheduling.Recipe#getAntibiotics <em>Antibiotics</em>}</li>
 * </ul>
 * </p>
 *
 * @see scheduling.SchedulingPackage#getRecipe()
 * @model
 * @generated
 */
public class Recipe {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	// Database credentials
	static final String USER = "zrwang";
	static final String PASS = "pdd63c";
	
	/**
	 * Returns the value of the '<em><b>Recipe Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe Name</em>' attribute.
	 * @see #setRecipeName(String)
	 * @see scheduling.SchedulingPackage#getRecipe_RecipeName()
	 * @model
	 * @generated
	 */

	String getRecipeName(String id){
		Connection conn = null;
    	PreparedStatement stmt = null;
        try {
        	//Register JDBC driver
            Class.forName(JDBC_DRIVER);
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://cse.unl.edu/zrwang",USER, PASS);
          //Get Connection
            
            String query = "SELECT RecipeName FROM Recipe WHERE id=?";
            
            stmt = conn.prepareStatement(query);
            stmt.setString(1,id);
            ResultSet rs = stmt.executeQuery();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
         }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
         }finally{
            //finally block used to close resources
            try{
               if(stmt!=null)
                  stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
               if(conn!=null)
                  conn.close();
            }catch(SQLException se){
               se.printStackTrace();
            }//end finally try
         }//end try
        return recipeName;
	}

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getRecipeName <em>Recipe Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe Name</em>' attribute.
	 * @see #getRecipeName()
	 * @generated
	 */
	void setRecipeName(String value);

	/**
	 * Returns the value of the '<em><b>Constituents Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituents Weights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituents Weights</em>' attribute.
	 * @see #setConstituentsWeights(int)
	 * @see scheduling.SchedulingPackage#getRecipe_ConstituentsWeights()
	 * @model
	 * @generated
	 */
	int getConstituentsWeights();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getConstituentsWeights <em>Constituents Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constituents Weights</em>' attribute.
	 * @see #getConstituentsWeights()
	 * @generated
	 */
	void setConstituentsWeights(int value);

	/**
	 * Returns the value of the '<em><b>Antibiotics Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics Ratio</em>' attribute.
	 * @see #setAntibioticsRatio(double)
	 * @see scheduling.SchedulingPackage#getRecipe_AntibioticsRatio()
	 * @model
	 * @generated
	 */
	double getAntibioticsRatio();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getAntibioticsRatio <em>Antibiotics Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Ratio</em>' attribute.
	 * @see #getAntibioticsRatio()
	 * @generated
	 */
	void setAntibioticsRatio(double value);

	/**
	 * Returns the value of the '<em><b>Antibiotics Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics Weights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics Weights</em>' attribute.
	 * @see #setAntibioticsWeights(int)
	 * @see scheduling.SchedulingPackage#getRecipe_AntibioticsWeights()
	 * @model
	 * @generated
	 */
	int getAntibioticsWeights();

	/**
	 * Sets the value of the '{@link scheduling.Recipe#getAntibioticsWeights <em>Antibiotics Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antibiotics Weights</em>' attribute.
	 * @see #getAntibioticsWeights()
	 * @generated
	 */
	void setAntibioticsWeights(int value);

	/**
	 * Returns the value of the '<em><b>Constituent</b></em>' containment reference list.
	 * The list contents are of type {@link scheduling.Constituent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituent</em>' containment reference list.
	 * @see scheduling.SchedulingPackage#getRecipe_Constituent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Constituent> getConstituent();

	/**
	 * Returns the value of the '<em><b>Antibiotics</b></em>' containment reference list.
	 * The list contents are of type {@link scheduling.Antibiotics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antibiotics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antibiotics</em>' containment reference list.
	 * @see scheduling.SchedulingPackage#getRecipe_Antibiotics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Antibiotics> getAntibiotics();

} // Recipe
