import java.util.*;
class TrieImplementation{
    class treenode{
        treenode[]freq=new treenode[26];
        boolean isleaf;
        treenode(){
            isleaf=false;
            for(int i=0;i<26;i++){
                freq[i]=null;
            }
        }
    }
    void insert(treenode root,String s){
        treenode cur=root;
        char[]ch=s.toCharArray();
        for(char c:ch){
            int index=c-'a';
            if(cur.freq[index]==null){
                cur.freq[index]=new treenode();
            }
            cur=cur.freq[index];
        }
        cur.isleaf=true;
    }

    boolean search(treenode root,String s){
        treenode cur=root;
        char[]ch=s.toCharArray();
        for(char c:ch){
            int index=c-'a';
            if(cur.freq[index]==null){
               return false;
            }
            else{
                cur=cur.freq[index];

            }
           
    }
     if(cur.isleaf)return true;
     return false;
}
}



