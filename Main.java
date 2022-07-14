package org.example;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.cache.*;
import net.dv8tion.jda.api.EmbedBuilder;
import java.awt.Color;
import java.util.Date;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter implements onMessageReceived {

    public static void main(String[] args) throws LoginException {

        JDABuilder builder = JDABuilder.createDefault("<Bot Token>");

        // Disable parts of the cache
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        // Enable the bulk delete event
        builder.setBulkDeleteSplittingEnabled(false);
        // Disable compression (not recommended)
        // Set activity (like "playing Something")
        builder.setActivity(Activity.watching("FOR !j help"));
        builder.addEventListeners(new Main());

            builder.build();


        System.out.println("Java: Hello world! :D");


    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        Message msg = event.getMessage();
        if (msg.getContentRaw().equals("!j help"))
        {
            MessageChannel channel = event.getChannel();
            long time = System.currentTimeMillis();
            channel.sendMessage("***Java Bot***: ***A bot made in Java***. **I (amukh1) am attempting to make a discord bot in every practical language. \n Github:** https://github.com/amukh1/Discord-Bots") /* => RestAction<Message> */
                    .queue();
        }else if(msg.getContentRaw().equals("java"))
        {
            MessageChannel channel = event.getChannel();
            long time = System.currentTimeMillis();
            channel.sendMessage("***HEYYYYY YESSSSS JAVA GANGGGG***") /* => RestAction<Message> */
                    .queue();
        }
    }
}
