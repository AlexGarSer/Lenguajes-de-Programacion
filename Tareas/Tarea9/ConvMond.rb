puts("Elige la moneda a la que deseas cambiar:")
printf("1.- Dólar\n2.- Euro\n3.- Yen\n4.- DolarHK\n\n")
mon = gets().to_i
printf("Ingresa la cantidad de pesos mexicanos que vas a convertir: $")
cant = gets.to_f
case mon
	when 1
        printf("Ingresa el valor de 1 Dólar actual en pesos mexicanos: $")
        val=gets.to_f
        conv =(cant / val).to_s
        puts("La cantidad de: $ #{cant} pesos mexicanos, ahora es la cantidad de: "+conv+" dolares") 
	when 2
        printf("Ingresa el valor de 1 Euro actual en pesos mexicanos: $")
        val=gets.to_f
        conv = (cant / val).to_s
        puts("La cantidad de: $ #{cant} pesos mexicanos, ahora es la cantidad de: "+conv+" euros") 
	when 3
        printf("Ingresa el valor de 1 Yen actual en pesos mexicanos: $")
        val=gets.to_f
        conv = (cant / val).to_s
        puts("La cantidad de: $ #{cant} pesos mexicanos, ahora es la cantidad de: "+conv+" yens") 
	when 4
		printf("Ingresa el valor de 1 Dolar de Hong Kong actual en pesos mexicanos: $")
        val=gets.to_f
        conv = (cant / val).to_s
        puts("La cantidad de: $ #{cant} pesos mexicanos, ahora es la cantidad de: "+conv+" dolaresHK")  
        
	else
		printf ("La opcion que elegiste no esta en el menu de opciones.")
end
