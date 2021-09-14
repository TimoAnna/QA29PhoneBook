package tests;

import application.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected static AppManager app = new AppManager();



    @BeforeClass
    public void setUp(){
    app.init();
    }

    @AfterClass
    public void tearDown(){
    app.stop();
    }



}

