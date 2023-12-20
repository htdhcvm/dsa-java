package flouheforst.practice.problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class GroupAnagrams {
    
    public List<List<String>> solution(String[] strs) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        
        for (String word : strs) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            
            String sortedWord = new String(wordChars);
            
            if (!hashMap.containsKey(sortedWord)) {
                hashMap.put(sortedWord, new ArrayList<>());
            }
            
            hashMap.get(sortedWord)
                    .add(word);
            
            hashMap.putIfAbsent(new String(wordChars), new ArrayList<>());
        }
        
        return new ArrayList<>(hashMap.values());
    }
    
    public List<List<String>> solution10(String[] strs) {
        List<List<String>> response = new ArrayList<>();
        List<String> list = new ArrayList<String>(Arrays.asList(strs));
        
        int i = 0;
        while (i < list.size()) {
            List<String> tmp = new ArrayList<>();
            
            String sTmp = list.get(i);
            
            int j = 0;
            
            while (j < list.size()) {
                if (j == i) {
                    j++;
                    continue;
                }
                
                if (isAnagram(sTmp, list.get(j))) {
                    tmp.add(list.get(j));
                    list.remove(j);
                    
                    j = 0;
                }
                j++;
            }
            
            if (!tmp.isEmpty()) {
                list.remove(i);
                tmp.add(sTmp);
                response.add(tmp);
                i = 0;
            } else {
                i++;
            }
        }
        
        list.forEach(v -> {
            response.add(new ArrayList<>(List.of(v)));
        });
        
        return response;
    }
    
    
    private boolean isAnagram(
            String s1,
            String s2
    ) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        for (Character ch : s1.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                Integer count = hashMap.get(ch);
                hashMap.put(ch, ++count);
            } else {
                hashMap.put(ch, 1);
            }
        }
        
        
        for (Character ch : s2.toCharArray()) {
            if (!hashMap.containsKey(ch)) {
                return false;
            }
            
            Integer count = hashMap.get(ch);
            
            if (hashMap.get(ch) == 0) {
                return false;
            }
            
            hashMap.put(ch, --count);
        }
        
        return true;
    }
}
