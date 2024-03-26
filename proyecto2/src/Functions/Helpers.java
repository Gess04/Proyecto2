/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author Gabriel Flores
 */
public class Helpers {
    /**
     * Valida si una cadena contiene solo letras.
     * @param letter La cadena a validar.
     * @return true si la cadena contiene solo letras, false de lo contrario.
     */
   public boolean validateLyrics(String letter){
        return letter.matches("[a-zA-Zñ]*");
    }
    /**
     * Valida si una cadena contiene solo números.
     * @param num La cadena a validar.
     * @return true si la cadena contiene solo números, false de lo contrario.
     */
    public boolean validateNumbers(String num){
        return num.matches("[0-9]*");
    }
    
    /**
     * Convierte una cadena de números en un entero, si es válida.
     * @param number La cadena de números a convertir.
     * @return El entero representado por la cadena, o -1 si la cadena no es válida.
     */
    public int ValidateNumbers(String number){
        if(validateNumbers(number)== true){
            int num = Integer.parseInt(number);
            return num;
        }else{
            return -1;
        }
    }
    /**
     * Valida si una cadena contiene solo letras y retorna la misma cadena si es válida.
     * @param letter La cadena a validar.
     * @return La cadena original si contiene solo letras, o null si no es válida.
     */
    public String ValidateLyrics(String letter){
        if (validateLyrics(letter) == true) {
            return letter;
        } else {
            return null;
        }
    }
    /**
     * Valida si una cadena de identificación es válida y la convierte en un entero.
     * @param id La cadena de identificación a validar y convertir.
     * @return El entero representado por la cadena de identificación, o -1 si no es válida.
     */
    public int ValidateID(String id){
        String replaceAll = id.replace(".", "");
        if(validateNumbers(replaceAll)== true){
            if(replaceAll.length() >= 7 && replaceAll.length()<= 9){
                int num = Integer.parseInt(replaceAll);
                return num;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    /**
     * Valida si una cadena de fecha es válida.
     * @param date La cadena de fecha a validar.
     * @return La cadena de fecha original si es válida, o null si no lo es.
     */
    public String ValidateDate(String date){
            return null;
    }
    /**
     * Valida si una cadena de teléfono es válida.
     * @param telf La cadena de teléfono a validar.
     * @return La cadena de teléfono original si es válida, o null si no lo es.
     */
    public String Validatetelf(String telf){
        String cell = telf.replaceAll(" ", "");
        if (cell.charAt(0) == '(') {
            if (cell.charAt(4) == ')') {
                String cell_uno = cell.replace('(', '0');
                String cell_dos = cell_uno.replace(')', '0');
                if (validateNumbers(cell_dos) == true) {
                    return telf;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    /**
     * Valida si una cadena de correo electrónico es válida.
     * @param email La cadena de correo electrónico a validar.
     * @return La cadena de correo electrónico original si es válida, o null si no lo es.
     */
    public String ValidateEmail(String email){
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                count++;
            }
        }
        if(count == 1){
            return email;
        }else{
            return null;
        }
    }
    /**
     * Valida si un tipo de habitación es válido.
     * @param roomType El tipo de habitación a validar.
     * @return El tipo de habitación original si es válido, o null si no lo es.
     */
    public String Validate_RoomType(String roomType){
        if(roomType.equalsIgnoreCase("simple") || roomType.equalsIgnoreCase("doble") || roomType.equalsIgnoreCase("triple") || roomType.equalsIgnoreCase("suite")){
            return roomType;
        }else{
            return null;
        }
    }
}
