package com.user;

public class UserArr {

	private static User[] arr = new User[3];
	static boolean v = false;

	public static User[] addUser() {
		User u = new User();
		u.setUserId(120);
		u.setName("alex");
		u.setAge("27");

		User u1 = new User();
		u1.setUserId(121);
		u1.setName("john");
		u1.setAge("37");

		User u2 = new User();
		u2.setUserId(122);
		u2.setName("richard");
		u2.setAge("57");

		arr[0] = u;
		arr[1] = u1;
		arr[2] = u2;
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
