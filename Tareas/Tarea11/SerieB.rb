puts("Ingresa el numero de terminos que deses imprimir:")
n = gets().to_f
x = 1.to_f
for i in (0...n)
        i += 1
        if(i/2 == 0)
            for j in (0...x) 
                print("#{i+1}, ")
            end
        else
            print("#{i * -1}, ")
            x = x + 1
        end
end