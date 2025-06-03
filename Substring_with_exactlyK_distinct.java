public class Substring_with_exactlyK_distinct.java {
    int countSubstr(String s, int k) {
       return count(s,k)-count(s,k-1);
    }
    
    int count(String s,int k){
         int ans=0;
        int j=0;
        HashMap<Character,Integer>mp=new HashMap();
        for(int i=0;i<s.length();i++){
          
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            
            
                
                while(j<s.length()&&mp.size()>k){
                    if(mp.get(s.charAt(j))==1)mp.remove(s.charAt(j));
                    else mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                    j++;
                    // ans++;
                }
                
            
            ans+=i-j+1;
        }
        // if(mp.size()==k) return ans+1;
        return ans;
    }
}