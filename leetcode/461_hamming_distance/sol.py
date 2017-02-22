def hammingDistance(x, y):
    """
    :type x: int
    :type y: int
    :rtype: int
    """
    # Convert to string
    # bin_x = list("{0:b}".format(x))
    # bin_y = list("{0:b}".format(y))
    # if len(bin_x) > len(bin_y):
    #     zeros = ['0'] * (len(bin_x) - len(bin_y))
    #     bin_y = zeros + bin_y
    # else:
    #     zeros = ['0'] * (len(bin_y) - len(bin_x))
    #     bin_x = zeros + bin_x
    #
    # res = 0
    # for i in range(0, len(bin_y)):
    #     if int(bin_y[i]) - int(bin_x[i]) != 0:
    #         res += 1

    # Integer manipulation (fastest)
    # bin_x = int("{0:b}".format(x))
    # bin_y = int("{0:b}".format(y))
    #
    # res = 0
    # while bin_x > 0 or bin_y > 0:
    #     if bin_x % 10 != bin_y % 10:
    #         res += 1
    #     bin_x /= 10
    #     bin_y /= 10

    # Check mod
    # res = 0
    # while x > 0 or y > 0:
    #     if x % 2 != y % 2:
    #         res += 1
    #     x /= 2
    #     y /= 2

    # One liner
    return bin(x^y).count('1')

    # return res

hammingDistance(4, 1)
