package flouheforst.practice.problems.array;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public int solution(String s) {
        Set<Character> set = new HashSet<>();
        List<Character> listChars = s.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        
        StringBuilder a = new StringBuilder();
        for (Character ch : s.toCharArray()) {
            a.append(ch);
            if (set.contains(ch)) {
                a.deleteCharAt(a.length() - 1);
                
            }
            set.add(ch);
        }
        
        // p w k e w
        // pwwk
        
        return a.length();
    }
    
    public int solution2(String s) {
        int response = 0;
        Set<Character> set = new HashSet<>();
        Deque<Character> deque = new ArrayDeque<>();
        
        for (Character ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                deque.addFirst(ch);
            } else {
                if (response < deque.size()) {
                    response = deque.size();
                }
                
                while (!deque.isEmpty() && deque.getLast() != ch) {
                    Character chCurrent = deque.removeLast();
                    set.remove(chCurrent);
                }
                
                Character chCurrent = deque.removeLast();
                set.remove(chCurrent);
                
                set.add(ch);
                deque.addFirst(ch);
            }
        }
        
        if (response < deque.size()) {
            response = deque.size();
        }
        
        return response;
    }
    
    public int solution4(String s) {
        int response = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        
        while (right < s.length()) {
            Character ch = s.charAt(right);
            
            set.add(ch);
            
            
            if (set.contains(ch)) {
                //               left = right;
            }
            
            right++;
        }
        
        //        for (Character ch : s.toCharArray()) {
        //            if (!set.contains(ch)) {
        //                set.add(ch);
        //            } else {
        //
        //
        //            }
        //        }
        //
        //        if (response < deque.size()) {
        //            response = deque.size();
        //        }
        //
        return response;
    }
    
    
    public int solution3(String s) {
        System.out.println(s.toCharArray());
        int maxLength = 0;
        int maxLengthGlobal = 0;
        char lastChar;
        
        Set<Character> set = new HashSet<>();
        
        for (Character ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                maxLength++;
                
                if (maxLength > maxLengthGlobal) {
                    maxLengthGlobal = maxLength;
                }
            } else {
                set = new HashSet<>();
                
                //                set.add(lastChar);
                if (maxLength > maxLengthGlobal) {
                    maxLengthGlobal = maxLength;
                }
                
                maxLength = 0;
            }
            lastChar = ch;
        }
        
        return maxLengthGlobal;
    }
    
    public int solution5(String s) {
        int n = s.length(), ans = 0; // n - длина строки, ans - максимальная длина подстроки без повторений
        int[] index = new int[128]; // Массив для хранения индексов последнего вхождения каждого символа (для ASCII)
        
        System.out.println(Arrays.toString(index));
        // Проходим по строке, расширяя и сжимая окно [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            System.out.println(index[s.charAt(j)]);
            i = Math.max(index[s.charAt(j)], i); // Обновляем левую границу окна, если встречаем повторяющийся символ
            ans = Math.max(ans, j - i + 1); // Вычисляем максимальную длину подстроки
            index[s.charAt(j)] = j + 1; // Обновляем индекс последнего вхождения символа
        }
        return ans; // Возвращаем максимальную длину
    }
}


