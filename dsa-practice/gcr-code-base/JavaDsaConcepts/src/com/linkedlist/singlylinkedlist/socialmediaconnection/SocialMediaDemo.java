package com.linkedlist.singlylinkedlist.socialmediaconnection;

public class SocialMediaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SocialMedia sm = new SocialMedia();

	        sm.addUser(1, "Ravi", 22);
	        sm.addUser(2, "Swaraj", 24);
	        sm.addUser(3, "Ashish", 23);
	        sm.addUser(4, "Ritesh", 25);

	        sm.addFriendConnection(1, 2);
	        sm.addFriendConnection(1, 3);
	        sm.addFriendConnection(2, 3);
	        sm.addFriendConnection(2, 4);

	        sm.displayFriends(1);
	        sm.displayFriends(2);

	        sm.findMutualFriends(1, 2);

	        sm.removeFriendConnection(1, 3);

	        sm.displayFriends(1);

	        sm.countFriendsForAllUsers();
	}

}