class Adventurer {
	String name; // �̸�
	int hp; //ü��
	  
	public void punch() {
		System.out.printf("[%s]�� ��ġ!!\n", name);
	}
	public void info() {
		System.out.println("["+name+"] HP: "+hp);
	}
}

class Knight extends Adventurer {
  int strength; // ��
  
  @Override
  public void info() {
	  System.out.println("["+name+"] HP: "+hp+" ��: "+strength);
	}
}

class Thief extends Adventurer {
  int agility; // ��ø

  @Override
  public void info() {
	  System.out.println("["+name+"] HP: "+hp+" ��ø: "+agility);
	}
}
public class UpCasting {
	public static void main(String[] args) {
		// ��� ��ü ���� �� �ʱ�ȭ
		Knight knight = new Knight();
		knight.name = "��� ������";
		knight.hp = 180;
		knight.strength = 50;
		
		// ���� ��ü ���� �� �ʱ�ȭ
		Thief thief = new Thief();
		thief.name = "���� ������";
		thief.hp = 120;
		thief.agility = 40;
		
		// �� ĳ���� - �θ� Ÿ������ ��ü�� �ؼ�
		Adventurer adv0 = knight;
		Adventurer adv1 = thief;
		
		// ���谡���� �迭 ����
		Adventurer[] advs = { adv0, adv1 };
		
		// ��� ���谡�� ���� ���
		for (int i = 0; i < advs.length; i++) {
			advs[i].info();
		}
	}
}