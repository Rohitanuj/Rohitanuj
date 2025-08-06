def all_substrings(s):
    for i in range(len(s)):
        for j in range(i + 1, len(s) + 1):
            yield s[i:j]  # slicing is efficient in Python

# Example usage:
for substr in all_substrings("ABC"):
    print(substr)
