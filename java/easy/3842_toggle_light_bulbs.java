/*
Problem: Toggle Light Bulbs
Platform: LeetCode
Problem No: 3842
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Initially sab bulbs off hain
- Har bulb number ko dekh kar:
    - Agar bulb already on hai → usse off karo
    - Agar bulb off hai → usse on karo
- Iske liye HashSet use karenge:
    - Set me sirf currently ON bulbs rahenge
- End me set ko list me convert karke sort karenge

------------------------------------------------
Algorithm:
------------------------------------------------
1. Ek HashSet banao (onBulbs)
2. Har bulb in bulbs list:
      - Agar onBulbs.contains(bulb):
            remove karo (off)
        else:
            add karo (on)
3. Set ko ArrayList me convert karo
4. List ko sort karo
5. Return result list

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        Set<Integer> onBulbs = new HashSet<>();

        for (int bulb : bulbs) {

            if (onBulbs.contains(bulb)) {
                onBulbs.remove(bulb); // turn off
            } else {
                onBulbs.add(bulb); // turn on
            }
        }

        List<Integer> result = new ArrayList<>(onBulbs);
        Collections.sort(result);

        return result;
    }
}
