def findTheDifference(s, t):
    """
    :type s: str
    :type t: str
    :rtype: str
    """
    s_letters = list(s)
    t_letters = list(t)
    my_dict = {}

    for l in t_letters:
        if l in my_dict:
            my_dict[l] += 1
        else:
            my_dict[l] = 1

    for l in s_letters:
        my_dict[l] -= 1

    for k,v in my_dict.items():
        if v == 1:
            return k

print(findTheDifference("abcde", "acbgde")) #=> 'g'
