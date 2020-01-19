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

		System.out.print("�ο���: ");
		int num = in.nextInt();
		Phone ph[] = new Phone[num];

		for (int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ: ");
			ph[i] = new Phone(in.next(), in.next());
		}
		System.out.println("���� �Ǿ����ϴ�.");

		while (true) {
			System.out.print("�˻��� �̸�: ");
			String name = in.next();
			if (name.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			for (int i = 0; i < num; i++) {
				if (name.equals(ph[i].name)) {
					System.out.println(name + "�� ��ȣ��" + ph[i].getTel() + "�Դϴ�.");
					break;
				} else if (!name.equals(ph[i].name) && i == (num - 1)) {
					System.out.println(name + "�� �����ϴ�.");
				}
			}
		}
	}

}
