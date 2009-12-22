#!/bin/bash
#
# Author: Michal "Karm" Babacek
#
# Script version: 2
#

echo "Running test cases...";

echo TestCase: biz.karms.hidato.app.game.impl.HidatoGameTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.game.impl.HidatoGameTest

echo TestCase: biz.karms.hidato.app.game.matrix.impl.CoordinatesTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.game.matrix.impl.CoordinatesTest

echo TestCase: biz.karms.hidato.app.game.matrix.impl.MatrixTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.game.matrix.impl.MatrixTest

echo TestCase: biz.karms.hidato.app.game.matrix.impl.HidatoConstraintTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.game.matrix.impl.HidatoConstraintTest

echo TestCase: biz.karms.hidato.app.util.impl.HidatoSolverTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.util.impl.HidatoSolverTest

echo TestCase: biz.karms.hidato.app.util.impl.HidatoConstraintTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.util.impl.HidatoConstraintTest

echo TestCase: biz.karms.hidato.app.util.impl.HidatoGeneratorTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.util.impl.HidatoGeneratorTest

echo TestCase: biz.karms.hidato.app.util.impl.HidatoValidatorTest
echo ---------------------------------------------------------------
java -cp "Hidato/lib/junit-4.5.jar:Hidato/lib/GameLib.jar:Hidato/HidatoApplication.jar" org.junit.runner.JUnitCore biz.karms.hidato.app.util.impl.HidatoValidatorTest
