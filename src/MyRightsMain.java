import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;

public class MyRightsMain extends JDialog {
    private JPanel contentPane;
    private JTextArea infoAboutCountry;
    private JComboBox comboBox1;
    private JTextArea humanRights;
    private JLabel ImageLabel;
    private JScrollBar scrollBar1;
    private JScrollBar scrollBar2;
    private JButton buttonOK;

    public MyRightsMain() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);



        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                Object obj = itemEvent.getItem();
                String selected = comboBox1.getSelectedItem().toString();
                if (selected == "Russia") {
                    //TODO: set text about Russia
                    infoAboutCountry.setText("Founded in the 12th century, the Principality of Muscovy was able to emerge \n " +
                            "from over 200 years of Mongol domination (13th-15th centuries) and to gradually conquer and absorb\n" +
                            " surrounding principalities. In the early 17th century, a new ROMANOV Dynasty continued this policy\n" +
                            " of expansion across Siberia to the Pacific. Under PETER I (ruled 1682-1725), hegemony was extended \n" +
                            "to the Baltic Sea and the country was renamed the Russian Empire. During the 19th century, more \n" +
                            "territorial acquisitions were made in Europe and Asia. Defeat in the Russo-Japanese War of 1904-05 \n" +
                            "contributed to the Revolution of 1905, which resulted in the formation of a parliament and other \n" +
                            "reforms. Repeated devastating defeats of the Russian army in World War I led to widespread rioting in\n" +
                            " the major cities of the Russian Empire and to the overthrow in 1917 of the imperial household. The \n" +
                            "communists under Vladimir LENIN seized power soon after and formed the USSR. The brutal rule of Iosif\n" +
                            " STALIN (1928-53) strengthened communist rule and Russian dominance of the Soviet Union at a cost of \n" +
                            "tens of millions of lives. After defeating Germany in World War II as part of an alliance with the US \n" +
                            "(1939-1945), the USSR expanded its territory and influence in Eastern Europe and emerged as a global \n" +
                            "power. The USSR was the principal adversary of the US during the Cold War (1947-1991). The Soviet \n" +
                            "economy and society stagnated in the decades following Stalin’s rule, until General Secretary Mikhail \n" +
                            "GORBACHEV (1985-91) introduced glasnost (openness) and perestroika (restructuring) in an attempt to \n" +
                            "modernize communism, but his initiatives inadvertently released forces that by December 1991 splintered \n" +
                            "the USSR into Russia and 14 other independent republics.\n" +
                            "Following economic and political turmoil during President Boris YELTSIN's term (1991-99), Russia shifted\n" +
                            " toward a centralized authoritarian state under the leadership of President Vladimir PUTIN (2000-2008, 2012-)\n" +
                            " in which the regime seeks to legitimize its rule through managed elections, populist appeals, a foreign policy\n" +
                            " focused on enhancing the country's geopolitical influence, and commodity-based economic growth. Russia faces \n" +
                            "a largely subdued rebel movement in Chechnya and some other surrounding regions, although violence still \n" +
                            "occurs throughout the North Caucasus.\n Ethnic groups:\n" +
                            "Russian 77.7%, Tatar 3.7%, Ukrainian 1.4%, Bashkir 1.1%, Chuvash 1%, Chechen 1%, other 10.2%, unspecified 3.9%\n" +
                            "note: nearly 200 national and/or ethnic groups are represented in Russia's 2010 census (2010 est.)\n" +
                            "Languages:\n" +
                            "Russian (official) 85.7%, Tatar 3.2%, Chechen 1%, other 10.1%\n" +
                            "note: data represent native language spoken (2010 est.)\n" +
                            "Religions:\n" +
                            "Russian Orthodox 15-20%, Muslim 10-15%, other Christian 2% (2006 est.)\n" +
                            "note: estimates are of practicing worshipers; Russia has large populations of\n" +
                            " non-practicing believers and non-believers, a legacy of over seven decades of Soviet rule;\n" +
                            " Russia officially recognizes Orthodox Christianity, Islam, Judaism, and Buddhism as traditional\n" +
                            "religions\n" +
                            "Population:\n" +
                            "142,423,773 (July 2015 est.)\n" +
                            "\n" +
                            "Unemployment, youth ages 15-24:\n" +
                            "total: 13.8%\n" +
                            "male: 13.3%\n" +
                            "female: 14.5% (2013 est.)\nDeath rate:\n" +
                            "13.69 deaths/1,000 population (2015 est.)\n" +
                            "\n" +
                            "Mother's mean age at first birth:\n" +
                            "24.6 (2009 est.)\n" +
                            "Education expenditures:\n" +
                            "4.1% of GDP (2008)\n" +
                            "\n" +
                            "Government type: federation\n" +
                            "Capital: Moscow\n");
                    humanRights.setText("Human Rights in Russia");

                    ImageLabel.setIcon(new ImageIcon("images/rs-map.gif"));

                } else if (selected == "Germany") {
                    infoAboutCountry.setText("As Europe's largest economy and second most populous nation (after Russia), Germany is a key\n" +
                            " member of the continent's economic, political, and defense organizations. European power struggles immersed Germany\n" +
                            " in two devastating World Wars in the first half of the 20th century and left the country occupied by the victorious\n" +
                            " Allied powers of the US, UK, France, and the Soviet Union in 1945. With the advent of the Cold War, two German states\n" +
                            " were formed in 1949: the western Federal Republic of Germany (FRG) and the eastern German Democratic Republic (GDR). \n" +
                            "The democratic FRG embedded itself in key Western economic and security organizations, the EC, which became the EU, \n" +
                            "and NATO, while the communist GDR was on the front line of the Soviet-led Warsaw Pact. The decline of the USSR and \n" +
                            "the end of the Cold War allowed for German unification in 1990. Since then, Germany has expended considerable funds \n" +
                            "to bring Eastern productivity and wages up to Western standards. In January 1999, Germany and 10 other EU countries \n" +
                            "introduced a common European exchange currency, the euro.\n Ethnic groups:\n" +
                            "German 91.5%, Turkish 2.4%, other 6.1% (made up largely of Greek, Italian, Polish, Russian, Serbo-Croatian, Spanish)\n" +
                            "Languages:\n" +
                            "German (official)\n" +
                            "note: Danish, Frisian, Sorbian, and Romany are official minority languages; Low German, Danish, North Frisian, Sater Frisian,\n" +
                            " Lower Sorbian, Upper Sorbian, and Romany are recognized as regional languages under the European Charter for Regional or \n" +
                            "Minority Languages\n" +
                            "Religions:\n" +
                            "Protestant 34%, Roman Catholic 34%, Muslim 3.7%, unaffiliated or other 28.3%\n" +
                            "Population:\n" +
                            "80,854,408 (July 2015 est.)\n" +
                            "Unemployment, youth ages 15-24:\n" +
                            "total: 7.9%\n" +
                            "male: 8.6%\n" +
                            "female: 7.1% (2013 est.)\n" +
                            "Death rate:\n" +
                            "11.42 deaths/1,000 population (2015 est.)\n" +
                            "Mother's mean age at first birth:\n" +
                            "29.2 (2012 est.)\n");
                    humanRights.setText("Human Rights in Germany");
                    //TODO: change path to image; set human rights for Germany
                    ImageLabel.setIcon(new ImageIcon("images/gm-map.gif + images/gm-lgflag.gif"));
                } else {
                    infoAboutCountry.setText("Bosnia and Herzegovina declared sovereignty in October 1991 and independence from the former Yugoslavia \n" +
                            "on 3 March 1992 after a referendum boycotted by ethnic Serbs. The Bosnian Serbs - supported by neighboring Serbia and Montenegro \n" +
                            "- responded with armed resistance aimed at partitioning the republic along ethnic lines and joining Serb-held areas to form \n" +
                            "a \"Greater Serbia.\" In March 1994, Bosniaks and Croats reduced the number of warring factions from three to two by signing \n" +
                            "an agreement creating a joint Bosniak-Croat Federation of Bosnia and Herzegovina. On 21 November 1995, in Dayton, Ohio, the \n" +
                            "warring parties initialed a peace agreement that ended three years of interethnic civil strife (the final agreement was signed\n" +
                            " in Paris on 14 December 1995).\n" +
                            "The Dayton Peace Accords retained Bosnia and Herzegovina's international boundaries and created a multiethnic and democratic \n" +
                            "government charged with conducting foreign, diplomatic, and fiscal policy. Also recognized was a second tier of government \n" +
                            "composed of two entities roughly equal in size: the predominantly Bosniak-Bosnian Croat Federation of Bosnia and Herzegovina\n" +
                            " and the predominantly Bosnian Serb-led Republika Srpska (RS). The Federation and RS governments are responsible for \n" +
                            "overseeing most government functions. Additionally, the Dayton Accords established the Office of the High Representative \n" +
                            "to oversee the implementation of the civilian aspects of the agreement. The Peace Implementation Council at its conference \n" +
                            "in Bonn in 1997 also gave the High Representative the authority to impose legislation and remove officials, the so-called \n" +
                            "\"Bonn Powers.\" An original NATO-led international peacekeeping force (IFOR) of 60,000 troops assembled in 1995 was succeeded\n" +
                            " over time by a smaller, NATO-led Stabilization Force (SFOR). In 2004, European Union peacekeeping troops (EUFOR) replaced SFOR.\n" +
                            " Currently EUFOR deploys around 600 troops in theater in a security assistance and training capacity.\n" +
                            "Note: within Bosnia and Herzegovina's recognized borders, the country is divided into a joint Bosniak/Croat Federation \n" +
                            "(about 51% of the territory) and the Bosnian Serb-led Republika Srpska or RS (about 49% of the territory); the region \n" +
                            "called Herzegovina is contiguous to Croatia and Montenegro, and traditionally has been settled by an ethnic Croat \n" +
                            "majority in the west and an ethnic Serb majority in the east.\n" +
                            "Ethnic groups:\n" +
                            "Bosniak 48.4%, Serb 32.7%, Croat 14.6%, other 4.3%\n" +
                            "note: final 2013 census results are pending; Bosniak has replaced Muslim as an ethnic term in part to avoid confusion\n" +
                            " with the religious term Muslim - an adherent of Islam (2013 est.)\n" +
                            "Languages:\n" +
                            "Bosnian (official), Croatian (official), Serbian (official)\n" +
                            "Religions:\n" +
                            "Muslim 40%, Orthodox 31%, Roman Catholic 15%, other 14%\n" +
                            "Population:\n" +
                            "3,867,055 (July 2015 est.)\n" +
                            "Death rate:\n" +
                            "9.75 deaths/1,000 population (2015 est.)\n" +
                            "Mother's mean age at first birth:\n" +
                            "26.3 (2011 est.)\n" +
                            "Child labor - children ages 5-14:\n" +
                            "total number: 24,722\n" +
                            "percentage: 5% (2006 est.)\n" +
                            "Unemployment, youth ages 15-24:\n" +
                            "total: 62.8%\n" +
                            "male: 62.8%\n" +
                            "female: 62.8% (2012 est.)\n" +
                            "Government type:\n" +
                            "federal democratic republic\n" +
                            "Capital:\n" +
                            "name: Sarajevo\n");
                    humanRights.setText("Human Rights in Bosnia and Herzegovina");
                    //TODO: change path to image; set human rights for Bosnia
                    ImageLabel.setIcon(new ImageIcon("images/bosnia-map.gif"));
                }

            }
        });
    }

    public static void main(String[] args) {
        MyRightsMain dialog = new MyRightsMain();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
