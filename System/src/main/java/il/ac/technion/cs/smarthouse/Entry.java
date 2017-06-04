package il.ac.technion.cs.smarthouse;

import java.util.Optional;

import il.ac.technion.cs.smarthouse.sensors.sos.gui.SosSensorSimulator;
import il.ac.technion.cs.smarthouse.sensors.stove.gui.StoveSensorSimulator;
import il.ac.technion.cs.smarthouse.sensors.vitals.gui.VitalsSensorSimulator;
import il.ac.technion.cs.smarthouse.system.file_system.FileSystemEntries;
import il.ac.technion.cs.smarthouse.system.gui.main_system.MainSystemGui;
import il.ac.technion.cs.smarthouse.system.user_information.UserInformation;
import il.ac.technion.cs.smarthouse.utils.JavaFxHelper;

public class Entry {

    public static void main(final String[] args) throws InterruptedException {
        // Logger.shutdown();
        MainSystemGui m = new MainSystemGui();
        m.launchGui(args);
        
        Thread.sleep(500);
        JavaFxHelper.startGui(new SosSensorSimulator(), args);
        
        Thread.sleep(1000);
        JavaFxHelper.startGui(new StoveSensorSimulator(), args);
        
        Thread.sleep(1000);
        JavaFxHelper.startGui(new VitalsSensorSimulator(), args);
        
        // m.getPresenter().getModel().getFileSystem().sendMessage(59,
        // FileSystemEntries.TESTS.buildPath("my.first.try"));

//        System.out.println("1: " + Optional.ofNullable(m.getPresenter().getModel().getUser())
//                        .orElse(new UserInformation("<NO_USER>", "", "", "")).getName());
//        m.getPresenter().getModel().initializeUser("Wonder-Woman", "123", "026790844", "HERE");
//        System.out.println("2: " + Optional.ofNullable(m.getPresenter().getModel().getUser())
//                        .orElse(new UserInformation("<NO_USER>", "", "", "")).getName());
//        m.getPresenter().getModel().getFileSystem().sendMessage("HELLO_ITS_ME2",
//                        FileSystemEntries.TESTS.buildPath("my.first.try"));
//        m.getPresenter().getModel().getFileSystem().sendMessage(null, FileSystemEntries.SAVEME.buildPath());
//        System.out.println("3: " + Optional.ofNullable(m.getPresenter().getModel().getUser())
//                        .orElse(new UserInformation("<NO_USER>", "", "", "")).getName());
//        System.out.println(m.getPresenter().getModel().getFileSystem().toString());
//        System.out.println(">> Now it should save to the server");
//        System.out.println(">> SLEEP for 10000");
//
//        Thread.sleep(20000);// server should be updated first
//
//        m.kill();
//        System.out.println(">> Killed old house\n\n");
//        Thread.sleep(5000);// server should be updated first
//        System.out.println(">> starting new house");
//        m = new MainSystemGui();
//        m.launchGui(args);
//        System.out.println(m.getPresenter().getModel().getFileSystem().toString());
//        System.out.println("4: " + Optional.ofNullable(m.getPresenter().getModel().getUser())
//                        .orElse(new UserInformation("<NO_USER>", "", "", "")).getName());
//
//        System.out.println(">> SLEEP for 5000");
//        Thread.sleep(5000);// server should be updated first
//        System.out.println(m.getPresenter().getModel().getFileSystem().toString());
//        System.out.println("5: " + Optional.ofNullable(m.getPresenter().getModel().getUser())
//                        .orElse(new UserInformation("<NO_USER>", "", "", "")).getName());
//
//        m.kill();
    }

}
