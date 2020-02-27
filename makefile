default:
	@echo "'make clean' removes *.class *~ files"
	@echo "'make compile' compiles all Java files"

clean:
	rm -f *.class

compile: 
	javac *.java

