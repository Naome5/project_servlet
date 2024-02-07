package com.conversion;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Myservlet extends HttpServlet {

    private static final long serialVersionUID = 2858827612512263419L;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        String inputNumber = req.getParameter("number");
        String conversionType = req.getParameter("convert");
        String result = "";

        try {
            if ("Binary".equals(conversionType)) {
                result = convertToBinary(inputNumber);
            } else if ("Decimal".equals(conversionType)) {
                result = convertToDecimal(inputNumber);
            } else if ("Hexa".equals(conversionType)) {
                result = convertToHexadecimal(inputNumber);
            } else if ("Octal".equals(conversionType)) {
                result = convertToOctal(inputNumber);
            } else {
                result = "Invalid conversion type";
            }
        } catch (NumberFormatException e) {
            result = "Invalid input. Please enter a valid number.";
        }

        req.setAttribute("inputNumber", inputNumber);
        req.setAttribute("conversionType", conversionType);
        req.setAttribute("result", result);
        req.setAttribute("binaryConversionType", binaryConversionType(conversionType));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/trial.jsp");
        dispatcher.forward(req, res);
    }

    private String binaryConversionType(String conversionType) {
        if ("Binary".equals(conversionType)) {
            return "Binary";
        } else if ("Decimal".equals(conversionType)) {
            return "Binary";
        } else if ("Hexa".equals(conversionType)) {
            return "Hexadecimal";
        } else if ("Octal".equals(conversionType)) {
            return "Octal";
        } else {
            return "Unknown";
        }
    }

    private String convertToBinary(String decimalNumber) {
        int decimal = Integer.parseInt(decimalNumber);
        return "Binary: " + Integer.toBinaryString(decimal);
    }

    private String convertToDecimal(String binaryNumber) {
        int decimal = Integer.parseInt(binaryNumber, 2);
        return "Decimal: " + decimal;
    }

    private String convertToHexadecimal(String decimalNumber) {
        int decimal = Integer.parseInt(decimalNumber);
        return "Hexadecimal: " + Integer.toHexString(decimal).toUpperCase();
    }

    private String convertToOctal(String decimalNumber) {
        int decimal = Integer.parseInt(decimalNumber);
        return "Octal: " + Integer.toOctalString(decimal);
    }
}
