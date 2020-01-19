package chap5;

import java.util.Scanner;

class Phone {
	String name, tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}

public class PhoneBook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("인원수: ");
		int num = in.nextInt();
		Phone ph[] = new Phone[num];

		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호: ");
			ph[i] = new Phone(in.next(), in.next());
		}
		System.out.println("저장 되었습니다.");

		while (true) {
			System.out.print("검색할 이름: ");
			String name = in.next();
			if (name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			for (int i = 0; i < num; i++) {
				if (name.equals(ph[i].name)) {
					System.out.println(name + "의 번호는" + ph[i].getTel() + "입니다.");
					break;
				} else if (!name.equals(ph[i].name) && i == (num - 1)) {
					System.out.println(name + "이 없습니다.");
				}
			}
		}
	}

}
