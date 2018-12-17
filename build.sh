#!/bin/bash
set -euo pipefail

pushd mp-ft
  mvn clean package
  docker build -t sdaschner/backpressure-sample:1 .
popd

pushd porcupine
  mvn clean package
  docker build -t sdaschner/backpressure-sample:2 .
popd
