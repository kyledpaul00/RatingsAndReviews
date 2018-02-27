package code.ratables;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import code.Review;


public class Song extends Ratable{

    private String artist;
    private String title; 


    /**
     * The constructor used to create new Song instances
     *
     * @param youtubeID The 11 character unique id for the song
     * @param artist The artist of the song
     * @param title The title of the song
     */
    public Song(String youtubeID, String artist, String title){
        this.id = youtubeID;
        this.artist = artist;
        this.title = title;
        this.ratables = new ArrayList<>();
    }


    // Getter methods
   
    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }

    /**
     * Returns all the ratings that have been added to this song
     *
     * @return A list of ratings for this song
     */
    


    /**
     * Adds a new rating to this song
     *
     * @param rating The rating to be added. Must be an integer between 1 and 5 inclusive
     */
  
    /**
     * Formats this song's YouTube ID into a full url
     *
     * @return A YouTube link for this song
     */
    public String getLink(){
        return "https://www.youtube.com/watch?v=" + this.id;
    }


    @Override
    public String getDescription(){
        return this.artist + " - " + this.title;
    }

    @Override
    public String toString(){
        return "(" + this.getLink() + ") " + this.getArtist() +
                " - " + this.getTitle() + " | ratings: " + this.getReviews();
    }


    /**
     * Play this song in the default web browser
     */
    public void play(){
        if(Desktop.isDesktopSupported()){
            try{
                String url = this.getLink();
                Desktop.getDesktop().browse(new URI(url));
            }catch(IOException e){
                e.printStackTrace();
            }catch(URISyntaxException e){
                e.printStackTrace();
            }
        }
    }


    /**
     * Opens a playlist of songs in YouTube using the machine's default we browser. A maximum of 50 songs
     * can be added to a playlist
     *
     * @param songs A list of songs to play
     */
    public static void playList(ArrayList<Song> songs){
        if(songs != null && Desktop.isDesktopSupported()){
            try{
                String url = "https://www.youtube.com/watch_videos?video_ids=";
                if(!songs.isEmpty()){
                    url += songs.get(0).getID();
                }
                for(int i = 1; i < songs.size(); i++){
                    url += "," + songs.get(i).getID();
                }
                Desktop.getDesktop().browse(new URI(url));
            }catch(IOException e){
                e.printStackTrace();
            }catch(URISyntaxException e){
                e.printStackTrace();
            }
        }
    }

}
