package com.londonhydro.datamigration.utils;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class NamespacePrefixMatcher extends NamespacePrefixMapper {
    @Override
    public String getPreferredPrefix(String s, String s1, boolean b) {
        if(s.equals("http://www.w3.org/2005/Atom")) {
            return "";
        } else if(s.equals("http://naesb.org/espi")) {
            return "espi";
        }
        return s1;
    }
}
