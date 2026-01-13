Binary Search:
- Fast searching algorithm
- Works only on SORTED array
- Divides array into two halves

Algorithm:
1. Find mid element
2. Compare mid with target
3. If equal → return index
4. If target is bigger → search right
5. If target is smaller → search left
6. Repeat until found or range ends

Formula for mid:
mid = start + (end - start) / 2

Why this formula?
- Prevents integer overflow

Time Complexity:
Best Case → O(1)
Worst Case → O(log n)

Space Complexity:
O(1)

Important Points:
- Array must be sorted
- Faster than linear search
