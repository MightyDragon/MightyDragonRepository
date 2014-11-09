package fuser;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import com.sun.j3d.utils.applet.MainFrame;

import main.DatabaseHandler;
import main.MainLibrary;
import main.OracleConnection;
import ui.NotificationDialog;
import ui.TopMenuBar;
import ui.borrower.AccountInfoDialog;
import ui.borrower.PayFineDialog;
import ui.borrower.PlaceHoldDialog;
import ui.borrower.SearchDialog;
import ui.clerk.AddBorrowerDialog;
import ui.clerk.CheckOutDialog;
import ui.clerk.CheckOverdueDialog;
import ui.clerk.ReturnDialog;
import ui.librarian.AddBookDialog;
import ui.librarian.CheckOutReportDialog;
import ui.librarian.MostPopularDialog;


/*
 * Created this class to make list of classes in Library package
 */

public class LibraryClassCollector {

	// Class used to manually create Arraylist of all classes in Library
	
ArrayList<Class> classes = new ArrayList<Class>();
	
	public LibraryClassCollector(){
		this.makeClasses();
		
	}
	
	public void makeClasses(){
		classes.add(DatabaseHandler.class);
		classes.add(MainLibrary.class);
		classes.add(OracleConnection.class);
		classes.add(MainFrame.class);
		classes.add(NotificationDialog.class);
		classes.add(TopMenuBar.class);
		classes.add(AccountInfoDialog.class);
		classes.add(PayFineDialog.class);
		classes.add(PlaceHoldDialog.class);
		classes.add(SearchDialog.class);
		classes.add(AddBorrowerDialog.class);
		classes.add(CheckOutDialog.class);
		classes.add(CheckOverdueDialog.class);
		classes.add(ReturnDialog.class);
		classes.add(AddBookDialog.class);
		classes.add(CheckOutReportDialog.class);
		classes.add(MostPopularDialog.class);
		
	}
	
	public ArrayList<Class> getClasses(){
		return classes;
	}
	
	public void Links(){
		
	}
	
}

