def findComplement(num):
    # num_list = list("{0:b}".format(num))
    # out_list = [str(1 - int(i)) for i in num_list]
    # out_num = int("".join(out_list), 2)
    # return out_num

    i = 1 << (len(bin(num)) - 2)
    return (i - 1) ^ num

# Test
findComplement(4) # => 3
