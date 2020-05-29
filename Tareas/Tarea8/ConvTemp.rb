Op1 = " 1.- Cº --> Fº"
Op2 = " 2.- Fº --> Cº"
puts("Ingrese la opcion de la convercion a realizar: "+Op1+Op2)
Dat1 = gets.to_i

case Dat1
	when 1
		puts("Ingrese la temperatura a convertir a Fº: ")
		val1= gets.to_i
		res1=(val1.to_f * (1.8) + 32).to_s
		puts("La temperatura seria de: "+ res1 + "ºF")
	
	when 2
		puts("Ingrese la temperatura a convertir a Cº: ")
		val1= gets.to_i
		res1=((val1.to_f - 32) * (0.55)).to_s
		puts("La temperatura seria de: "+ res1 + "ºF")
	
	else
		puts("Se ingreso una opcion invalida.")
end




