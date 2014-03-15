package scheduling;

import java.sql.*;
import java.util.*;
import java.io.*;

import org.eclipse.emf.common.util.EList;

public class Recipedata implements Recipe{
	String RecipeName = getRecipeName();
	
	EList<Constituent> constituent;
	
	public String getRecipeName(){
		
		return RecipeName;
	}
	
	public EList<Constituent> getConstituent(){
		
		return constituent;
	}
}
