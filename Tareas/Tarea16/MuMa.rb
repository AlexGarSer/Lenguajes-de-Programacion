puts("Ingresa la cantidad de filas de la Matriz 1º:[?]")
a1 = gets().to_i
puts("Ingresa la cantidad de columnas de la Matriz 1º:[?]")
a2 = gets().to_i
puts("Ingresa la cantidad de filas de la Matriz 2º:[?]")
b1 = gets().to_i
puts("Ingresa la cantidad de columnas de la Matriz 2º:[?]")
b2 = gets().to_i

if (a1<0 | b1<0 | a2<0 | b2<0)
    puts("La suma de matrices no se puede realizar ya que una de las filas o columnas es un numero negativo.")
else 
    matriza = Array.new(a1){Array.new(a2)}
    matrizb = Array.new(b1){Array.new(b2)}
    matrizc = Array.new(a1){Array.new(b2)}
    
    puts("Ingresa los datos de la 1º Matriz.")
    for i in (0...a1)
        for j in (0...a2)
            print("Ingresa los datos: [#{i+1}][#{j+1}]:")
            matriza[i][j] = gets().to_i
        end
    end
    puts("Ingresa los datos de la 2º Matriz.")
    for i in (0...b1)
        for j in (0...b2)
            print("Ingresa los datos: [#{i+1}][#{j+1}]:")
            matrizb[i][j] = gets().to_i
        end
    end
    for i in (0...a1)
        for j in (0...a2)
            matrizc[i][j] = matriza[i][j] * matrizb[i][j]
        end
    end
    puts("Matriz resultante de la multipliacion es:")
    for i in (0...a1)
	    for j in (0...b2)
		    print("#{matrizc[i][j]} ")
	    end
	    puts()
    end
end