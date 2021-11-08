class Adventurer {
	String name; // 이름
	int hp; //체력
	  
	public void punch() {
		System.out.printf("[%s]의 펀치!!\n", name);
	}
	public void info() {
		System.out.println("["+name+"] HP: "+hp);
	}
}

class Knight extends Adventurer {
  int strength; // 힘
  
  @Override
  public void info() {
	  System.out.println("["+name+"] HP: "+hp+" 힘: "+strength);
	}
}

class Thief extends Adventurer {
  int agility; // 민첩

  @Override
  public void info() {
	  System.out.println("["+name+"] HP: "+hp+" 민첩: "+agility);
	}
}
public class UpCasting {
	public static void main(String[] args) {
		// 기사 객체 생성 및 초기화
		Knight knight = new Knight();
		knight.name = "기사 조현준";
		knight.hp = 180;
		knight.strength = 50;
		
		// 도적 객체 생성 및 초기화
		Thief thief = new Thief();
		thief.name = "도적 조현준";
		thief.hp = 120;
		thief.agility = 40;
		
		// 업 캐스팅 - 부모 타입으로 객체를 해석
		Adventurer adv0 = knight;
		Adventurer adv1 = thief;
		
		// 모험가들의 배열 생성
		Adventurer[] advs = { adv0, adv1 };
		
		// 모든 모험가의 정보 출력
		for (int i = 0; i < advs.length; i++) {
			advs[i].info();
		}
	}
}