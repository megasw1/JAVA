package alone;

import excrption.IDFormatException;

public class PasswordTest {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {

		if (password == null) {
			throw new PasswordException("비밀번호는 null 일 수 없습니다");
		} else if (password.length() < 5) {
			throw new PasswordException("비밀번호는 5자리 이상입니다");
		}else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자를 포함하세요");
		}

		this.password = password;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordTest test = new PasswordTest();
		String password = "abccxxxc5";
		try {
			test.setPassword(password);
			System.out.println(password + "는 사용가능 합니다");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
