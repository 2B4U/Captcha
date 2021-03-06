package me.kyllian.captcha.listeners.login;

import fr.xephi.authme.events.LoginEvent;
import me.kyllian.captcha.CaptchaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class LoginListener implements Listener {

    private CaptchaPlugin plugin;

    public LoginListener(CaptchaPlugin plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onLogin(LoginEvent event) {
        plugin.getCaptchaHandler().login(event.getPlayer());
    }
}
