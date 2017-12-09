package leetcode;

public class MaxArea {
	/*
	������߶�LС���Ҷ��߶�Rʱ����L���ƣ�
	��ʱ��������L���Ҷ������߶Σ�R-1, R-2, ...����ɵ�ľͰ����ЩľͰ��û��Ҫ�жϵģ�
	��Ϊ��ЩľͰ���ݻ��϶���û��L��R��ɵ�ľͰ�ݻ���
	*/
	public static int maxArea(int[] height) {
		
		if(height.length < 2)
			return 0;
		
		int i = 0;
		int j = height.length - 1;
		
		int maxarea = 0;
		while(i < j) {
			
			int area = Math.min(height[i], height[j]) * (j - i);
			if(area > maxarea)
				maxarea = area;
			
			if(height[i] < height[j])
				i ++;
			else
				j --;
		}
		
		return maxarea;
		
	}
	
	
	public static void main(String[] args) {
		int[] height = {1,1};
		System.out.println(maxArea(height));
	}
	

}
