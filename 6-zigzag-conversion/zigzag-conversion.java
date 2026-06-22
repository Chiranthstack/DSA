class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1||s.length()<=numRows) return s;

        StringBuilder[] rows= new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
            rows[i]= new StringBuilder();
            
            int cr=0;
            boolean down=true;

            for(char c:s.toCharArray()){
                rows[cr].append(c);
                if(cr==0) down=true;
                else if(cr==numRows-1) down=false;
                cr+= down ? 1:-1;
            }
            StringBuilder ans = new StringBuilder();
            for(StringBuilder sb:rows)
            ans.append(sb);
            return ans.toString();
        
    }
}