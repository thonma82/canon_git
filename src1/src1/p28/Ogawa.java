package p28;

public class Ogawa extends Object {
	int data;

	Ogawa(int data) {
		this.data = data;

	}

	public boolean equals(Object j) {
		Ogawa o = (Ogawa) j;

		if (this.data == o.data) {
			return true;
		}

		return false;
	}

}
