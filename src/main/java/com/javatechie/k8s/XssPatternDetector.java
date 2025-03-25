//package com.javatechie.k8s;
//
////import lombok.extern.slf4j.Slf4j;
//
//import java.util.Arrays;
//import java.util.List;
////@Slf4j
//public class XssPatternDetector {
//
//    private static final List<String> XSS_PATTERNS = Arrays.asList(
//            // Script tags and attributes
//            "<sc/**/ript", "</script", "javascript:", "vbscript:", "livescript:", "mocha:",
//
//            // Event handlers
//            "onabort=", "onactivate=", "onafterprint=", "onafterupdate=", "onbeforeactivate=",
//            "onbeforecopy=", "onbeforecut=", "onbeforedeactivate=", "onbeforeeditfocus=",
//            "onbeforepaste=", "onbeforeprint=", "onbeforeunload=", "onbeforeupdate=",
//            "onblur=", "onbounce=", "oncellchange=", "onchange=", "onclick=", "oncontextmenu=",
//            "oncontrolselect=", "oncopy=", "oncut=", "ondataavailable=", "ondatasetchanged=",
//            "ondatasetcomplete=", "ondblclick=", "ondeactivate=", "ondrag=", "ondragend=",
//            "ondragenter=", "ondragleave=", "ondragover=", "ondragstart=", "ondrop=",
//            "onerror=", "onerrorupdate=", "onfilterchange=", "onfinish=", "onfocus=",
//            "onfocusin=", "onfocusout=", "onhashchange=", "onhelp=", "onkeydown=",
//            "onkeypress=", "onkeyup=", "onload=", "onlosecapture=", "onmessage=",
//            "onmousedown=", "onmouseenter=", "onmouseleave=", "onmousemove=", "onmouseout=",
//            "onmouseover=", "onmouseup=", "onmousewheel=", "onmove=", "onmoveend=",
//            "onmovestart=", "onoffline=", "ononline=", "onpage=", "onpaste=", "onprogress=",
//            "onpropertychange=", "onreadystatechange=", "onreset=", "onresize=",
//            "onresizeend=", "onresizestart=", "onrowenter=", "onrowexit=", "onrowsdelete=",
//            "onrowsinserted=", "onscroll=", "onselect=", "onselectionchange=", "onselectstart=",
//            "onstart=", "onstop=", "onsubmit=", "onunload=",
//
//            // Dangerous attributes and values
//            "javascript&colon;", "data:", "base64", "expression(", "url(", "eval(",
//            "execscript(", "mshtml:", "behavior:", "binding:", "-moz-binding:", "@import",
//
//            // Other dangerous patterns
//            "fromcharcode", "alert(", "prompt(", "confirm(", "execute(", "settimeout(",
//            "setinterval(", "function()", "<embed", "<object", "<iframe", "<frame",
//            "<applet", "<meta", "<svg", "<form", "<isindex", "<base", "background-image:",
//
//            // SQL injection patterns
//            "union select", "union all select", "update set", "insert into", "delete from",
//
//            // Encoded characters that might be used to bypass filters
//            "&#", "\\u", "%3c", "%3e", "%28", "%29", "%3d"
//    );
//
//    /**
//     * Checks if input contains potentially malicious content
//     * @param input the untrusted input
//     * @return true if input contains malicious content
//     */
//    public static boolean containsMaliciousContent(String input) {
//        if (input == null) {
//            return false;
//        }
//
//        String lowerInput = input.toLowerCase();
//
//        // Check for HTML tags
//        if (lowerInput.matches(".*[<].*[>].*")) {
//            return true;
//        }
//
//        // Check for all XSS patterns
//        return XSS_PATTERNS.stream()
//                .anyMatch(lowerInput::contains);
//    }
//
//    /**
//     * Checks if input contains HTML tags
//     * @param input the untrusted input
//     * @return true if input contains HTML tags
//     */
//    private static boolean containsHtmlTags(String input) {
//        return input.matches(".*<[^>]+>.*");
//    }
//}
