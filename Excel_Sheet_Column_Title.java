public class Excel_Sheet_Column_Title{
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char result = (char)('A' + columnNumber%26);
            sb.insert(0,result);
            columnNumber /= 26;
        }
        return sb.toString();
    }
}