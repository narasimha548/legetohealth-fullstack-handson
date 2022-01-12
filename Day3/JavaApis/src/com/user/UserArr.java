package com.user;

public class UserArr {

	private static User[] arr;
	static boolean v = false;

	public static User[] addUser() {
		
	  arr = new User[] { new User(120, "alex", "27"),new User(121, "john", "24"),new User(123, "alex", "29")};
		return arr;
	}

	public static void searchId1(int id) throws UserNotFoundException {

		for (User ar : arr) {
			System.out.println(ar.getUserId());
			if (ar.getUserId() == id) {
				v = true;
				break;
			}
		}

		// handleException(v);

	}

	public static User searchId(int id) throws UserNotFoundException {

		for (User ar : arr) {
			//System.out.println(ar.getUserId());
			if (ar.getUserId() == id) {
				return ar;
			}
		}

		return null;
	}

}
