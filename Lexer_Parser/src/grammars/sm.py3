def threesmooth(n):
    S = 1
    i2 = 0  # current index in 2S
    i3 = 0  # current index in 3S
    i = 0
    while i < n:
        n2 = 2 * S[i2]
        n3 = 3 * S[i3]
        S = min(n2, n3)
        i+= 1
        i2 += n2 <= n3
        i3 += n2 >= n3
    return S

print(threesmooth(1))
print(threesmooth(4))