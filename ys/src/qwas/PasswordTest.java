package qwas;

public class PasswordTest {

	private String password;

	public String getPassword() {
		return password;
	}								//setter�� PasswordException�� �߻���Ų��.
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("��й�ȣ�� null�̸� �ȵ˴ϴ�.");
		}
		else if(password.length() <5) {
			throw new PasswordException("��й�ȣ�� 5���̻��̾�� �մϴ�.");
		}
		//string�� �����ϴ��� a���� z,A����Z�� �ѹ� �̻� �ݺ��Ǵ��� 
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		//�׷����ʴٸ� password�� password�ϻ�
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("���� ��");
		} catch (PasswordException e) {
				System.out.println(e.getMessage());
		}
		
		password = "abc";
		try {
			test.setPassword(password);
			System.out.println("���� ��2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("���� ��3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde!!";
		try {
			test.setPassword(password);
			System.out.println("����4��");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}

