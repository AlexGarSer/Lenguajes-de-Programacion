puts("Ingresa el numero de terminos que deses imprimir:")
n = gets().to_f
for i in(0..n)
        exp = 2*i-1.to_f
        res = (i**exp).to_s
        puts(res)
end