/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jimenezfrontend;

import javax.swing.JOptionPane;

/**
 *
 * @author berik
 */
public class Main
    {

    public static final String[] players =
	{
	"2 jugadores", "3 jugadores", "4 jugadores", "5 jugadores"
	};

    public static void main(String[] args)
	{
	Game myGame = Game.getInstance();
	String player_response = (String) JOptionPane.showInputDialog(null, "Escoge el número de jugadores", "Siete y media", JOptionPane.QUESTION_MESSAGE, null, players, players[0]);
	int total_players = Integer.parseInt(player_response.substring(0, 1));
	String[] playerNames = new String[total_players];
	for (int i = 0; i < total_players; i++)
	    {
	    player_response = (String) JOptionPane.showInputDialog(null, "Introduce el nombre del jugador " + (i + 1), "Nombre", JOptionPane.QUESTION_MESSAGE);
	    playerNames[i] = player_response;
	    }
	myGame.makeGame(playerNames);
	}
    }
