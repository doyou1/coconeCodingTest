package study0423;


public class Solution1 {
    
	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		//스킬트리 순서
		String skill = "CBD";
		
		//스킬트리 예제
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int answer = s1.solution(skill,skill_trees);
		System.out.println(answer);
		

	}
	public int solution(String skill, String[] skill_trees) {
		
		int answer = 0;
		//스킬트리
        String[] arrSkill = skill.split(""); 
        
        for(String sts : skill_trees) {
        	
        	//특정 스킬트리 하나를 나눠담 
        	String[] arrTree = sts.split("");
        	
        	int howContain = 0;
        	//순서 상관없이 포함돼있으면 cnt++
        	for(String sk : arrSkill) {
        		if(sts.indexOf(sk) != -1) {
        			howContain++;
        		};
        	}
        	
        	int cnt = 0;
        	for(int i=0;i<arrTree.length;i++) {
        		String x = arrTree[i];
        		//앞에서부터 순서 포함돼있으면 cnt++
        		//스킬트리의 첫번째가 있을 때까지 확인
        		if((skill.charAt(cnt) + "").equals(x)) {
        			cnt++;	
        		}
        		//순서없이 포함된 char 갯수랑 
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
