import java.util.Scanner;

public class Welcome {
	static final int Num_Book = 3;
	static final int Num_ITEM = 7;
	
	public static void menuCartAddItem(String[][] book) {
		//System.out.println("장바구니에 항목 추가하기 : ");
		
		BookList(book);
		for(int i = 0; i < Num_Book; i++) {
		for(int j = 0; j < Num_ITEM; j++)
			System.out.print(book[i][j] + "|");
		System.out.println("");
		}
	}

	public static void main(String[] args) {
		String[][] mBook = new String[Num_Book][ Num_ITEM];
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요: ");
		String name = input.next();
		
		System.out.println("연락처를 입력하세요: ");
		int phone = input.nextInt(); // 숫자만 입력
			
		String greeting = "Welcome to Shopping Mall!";
		String tagline = "Welcome to Book Market!!";
		
		System.out.println("**********************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("**********************************");
		
		/*
		System.out.println("**********************************");
		System.out.println("1. 고객 정보 확인하기\t5. 장바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기\t7. 장바구니의 항목 삭제하기");
		System.out.println("4. 영수증 표시하기\t8. 종료");
		System.out.println("********************");
		*/
		
		menuIntroduction();
		
		System.out.println("메뉴 번호를 선택하세요: ");
		int n = input.nextInt(); // 숫자만 입력
		if(n < 1 || n > 8) {
		System.out.println("1부터 8까지의 숫자르 입력하세요.");
	} else {
		switch(n) {
		case 1: 
			menuGuestInfo(name, phone);
			break;
		case 2:
			menuCartltemList();
			break;
		case 3:
			menuCartClear();
			break;
		case 4:
			menuCartAddItem();
			break;
		case 5:
			menuCartRemoveItemCount();
			break;
		case 6:
			menuCartRemoveItem();
			break;
		case 7:
			menuCartBill();
			break;
		case 8:
			menuCartExit();
			break;			
		}
}
};

/**
* 설명: 고객님 정보출력
* 매게변수: 
* - string     name 고객님 이름
* - int        phone  휴대 전화 번호
* 반환값:
*/

public static void menuIntroduction() {
	
}
public static void menuGuestInfo(String name, int moblie) {
	
}
public static void menuCartltemList() {
	System.out.println("2. 장바구니 상품 목록보기");
}
public static void menuCartClear() {
	System.out.println("3. 장바구니 비우기");
}
public static void menuCartAddItem() {
	System.out.println("4. 장바구니 항목 추가하기");
}
public static void menuCartRemoveItemCount() {
	System.out.println("5. 장바구니 항목 수량 줄이기");
}
public static void menuCartRemoveItem() {
	System.out.println("6. 장바구니 항목 삭제하기");
}
public static void menuCartBill() {
	System.out.println("7. 영수증 표시하기");
}
public static void menuCartExit() {
	System.out.println("8. 종료");
}


public static void menuExit() {
	System.out.print("8. 종료");
}

public static void BookList(String[][] book) {
	book[0][0] = "ISBN1234";
	book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
	book[0][2] = "27000";
	book[0][3] = "송미영";
	book[0][4] = "단계별로 쇼핑몰ㄹ을 구현하며 배우는 HSP 웹프로그래밍";
	book[0][5] = "IT 전문서";
	book[0][6] = "2018/10/08";
	
	 book[1][0] = "ISBN1235";
	book[1][1] = "안드로이드 프로그래밍";
	book[1][2] = "33000";
	book[1][3] = "우채남";
	book[1][4] = "실습 단계별 명쾌한 멘토링!";
	book[1][5] = "IT견문서";
	book[1][6] = "2022/01/22";
	
    book[2][0] = "ISBN1236";
	book[2][1] = "스크래치";
	book[2][2] = "22000";
	book[2][3] = "고광일";
	book[2][4] = "컴퓨터 사고룍울 키우는 블록코딩";
	book[2][5] = "컴퓨터 입문";	
	book[2][6] = "2019/06/10";	
}
}
















