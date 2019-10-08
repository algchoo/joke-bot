package SmiteQueueBot;

import Bot.Bot;

import java.awt.*;
import java.awt.event.ActionListener;

public class SmiteQueueBot extends Bot {


    @Override
    public void runBot() {
        // Watches for system tray notification given from smite.exe
        // Goal, have it tab me back into the game when that notification appears
        SystemTray test = SystemTray.getSystemTray();
        System.out.println(test);
    }

    @Override
    public String doAction() {
        return null;
    }
}
