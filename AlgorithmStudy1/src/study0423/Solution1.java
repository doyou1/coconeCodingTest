package study0423;


public class Solution1 {
    
	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		//��ųƮ�� ����
		String skill = "CBD";
		
		//��ųƮ�� ����
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int answer = s1.solution(skill,skill_trees);
		System.out.println(answer);
		

	}
	public int solution(String skill, String[] skill_trees) {
		
		int answer = 0;
		//��ųƮ��
        String[] arrSkill = skill.split(""); 
        
        for(String sts : skill_trees) {
        	
        	//Ư�� ��ųƮ�� �ϳ��� ������ 
        	String[] arrTree = sts.split("");
        	
        	int howContain = 0;
        	//���� ������� ���Ե������� cnt++
        	for(String sk : arrSkill) {
        		if(sts.indexOf(sk) != -1) {
        			howContain++;
        		};
        	}
        	
        	int cnt = 0;
        	for(int i=0;i<arrTree.length;i++) {
        		String x = arrTree[i];
        		//�տ������� ���� ���Ե������� cnt++
        		//��ųƮ���� ù��°�� ���� ������ Ȯ��
        		if((skill.charAt(cnt) + "").equals(x)) {
        			cnt++;	
        		}
        		//�������� ���Ե� char ������ 
        		if(cnt == howContain) {
        			System.out.println(sts);
            		answer++;
            		break;
            	}
        	}
        	
        	
        }
        return answer;
    }
}