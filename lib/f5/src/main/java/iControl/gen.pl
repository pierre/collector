$file = $ARGV[0];

my @iface_list;

open(INPUT, "<$file") or die ("Can't open $file for input...");
while(<INPUT>)
{
	s/\n//;
	s/ //;
	
	push @iface_list, $_;
#	print "private ${_}BindingStub m_$_ = null;\n";
}
close(INPUT);

foreach $iface (@iface_list)
{
	print "private ${iface}BindingStub m_${iface} = null;\n";
}

foreach $iface (@iface_list)
{
	print "public ${iface}BindingStub get${iface}() throws Exception ";
	print "{ ";
	print "if (!m_bInitialized ) { throw new IllegalStateException(\"Not Initialized\"); } ";
	print "if (null == m_${iface} ) ";
	print "{ m_${iface} = (iControl.${iface}BindingStub) ";
	print "new iControl.${iface}Locator().get${iface}Port(new java.net.URL(buildURL())); ";
	print "} ";
	print "setupInterface(m_${iface}); ";
	print "return m_${iface};";
	print "}\n";
}

foreach $iface (@iface_list)
{
	print "m_${iface} = null;\n";
}